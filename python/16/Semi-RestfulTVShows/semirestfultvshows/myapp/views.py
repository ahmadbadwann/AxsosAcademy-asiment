from django.shortcuts import redirect,render
from .models import *
from django.contrib import messages

# Create your views here.
def root(request):
    context={
        "get_all_shows" :get_all_show()
    }
    return render(request,'allshows.html',context)

def new_show(request):
    return render(request,'newshow.html')

def add_anew_show(request):
    errors = Shows.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect('/new')
    else: 
        new_showw=add_a_new_show(request.POST['title'],request.POST['network'],request.POST['release_date'],request.POST['desc'])
    return redirect(f"/show/{new_showw.id}")

def showtv(request,tvid):
    id=tvid
    context={
        'show': get_show_id(id)
    }
    return render (request,'tvshow.html',context)


def update_show(request,id):
    errors = Shows.objects.basic_validator(request.POST)
    if len(errors) > 0:
        for key, value in errors.items():
            messages.error(request, value)
        return redirect(f'/show/{id}/edit')
    else:
        ed_show=edit_showw(id,request.POST['title'],request.POST['network'],request.POST['release_date'],request.POST['desc'])
    return redirect(f"/show/{ed_show.id}")



def edit_show(request,tvid):
    id=tvid
    context={
        "edit": get_show_id(id)
    }
    return render (request,'editshow.html',context)


def delete(request, id):
    dele(id)
    return redirect('/')
