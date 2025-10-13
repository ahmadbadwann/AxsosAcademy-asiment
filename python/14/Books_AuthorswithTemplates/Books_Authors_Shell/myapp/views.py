from django.shortcuts import render, redirect,HttpResponse
from .models import *

# Create your views here.
def root(request):
    get_books=get_all_books()
    context={
        "get_books": get_books
    }
    return render(request,'book.html',context)

def creat_book(request):
    new_book=cre_book(request.POST['title'],request.POST['description'])
    return redirect('/')


def authore(request):
    get_authors=get_all_authors()
    context={
        "get_authors":get_authors,
    }
    return render(request,'authors.html',context)

def creat_authore(request):
    new_authore=cre_author(request.POST['first_name'],request.POST['last_name'],request.POST['notes'])
    return redirect('add_auther')


def author_id(request, id_author):
    author_id=get_author_id(id_author)
    context={
        "author_id":author_id
    }
    return render(request,'lautau.html',context)





def book_details(request, book_id):
    book_ids=get_book_id(book_id)
    context={
        "book_ids" :book_ids
    }
    return render(request,'phpbook.html',context)