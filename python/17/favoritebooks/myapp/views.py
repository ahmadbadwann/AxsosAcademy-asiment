from django.shortcuts import render,redirect
from .models import *

# Create your views here.
def root(request):
    return render(request,'login.html')

def regeisteration(request):
    new_user=request_user(request.POST['first_name'],request.POST['last_name'],request.POST['email'],request.POST['password'])
    return redirect('/')

def logg_in(request):
    log_in_user=log_in(request.POST['email'],request.POST['password'])
    request.session['id'] = log_in_user.id
    all_books=get_all_booke()
    context={
        "log_in_user" :log_in_user,
        "all_books" :all_books
    }
    return render(request,'book.html',context)


def add_book(request):
    if request.method == 'POST':
        creat_book(request.POST['title'],request.POST['desc'],request.POST['id'])
        log_in_user=log_in_id(request.POST['id'])
        all_books=get_all_booke()
        context={
            "log_in_user" :log_in_user,
            "all_books" :all_books
        }
        return render(request,'book.html',context)
    return redirect('/')

def edit_book(request,bookid,userid):
    book=get_book_id(bookid)
    user=log_in_id(userid)
    likers=get_all_likers(bookid)
    context={
        "book" :book,
        "user" :user,
        "likers" :likers
    }
    return render(request,'edit_book.html',context)

def view_book(request,bookid,userid):
    book=get_book_id(bookid)
    user=log_in_id(userid)
    likers=get_all_likers(bookid)
    context={
        "book" :book,
        "user" :user,
        "likers" :likers
    }
    return render(request,'view_book.html',context)

def like_book(request):
    book=get_book_id(request.POST['bookid'])
    user=log_in_id(request.POST['userid'])
    book.user_who_likes(user)
    book.save


def update(request):
    update_book(request.POST['bookid'],request.POST['title'],request.POST['disc'])
    return redirect('/add_favorit_booke')

def delete_book(request):
    delete(request.POST['bookid'])
    return redirect('/add_favorit_booke')

