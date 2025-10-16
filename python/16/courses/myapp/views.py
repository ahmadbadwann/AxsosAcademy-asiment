from django.shortcuts import render,redirect ,HttpResponse
from .models import *
from django.contrib import messages
# Create your views here.
def root(request):
    detall=get_all()
    context={
        "get_alls" :detall
    }
    return render(request,'index.html',context)

def creat_cour(request):
    errors = Course.objects.basic_validator(request.POST)
    if len(errors)>0:
        for key, value in errors.items():
            messages.error(request,value)
        return redirect('/')
    else:
        new_cour=cereat_course(request.POST['name'],request.POST['desc'])
    return redirect('/')

def remov(request,id):
    get_cours_id=get_id(id)
    context={
        "get_cours_id" :get_cours_id
    }
    return render(request,'remove.html',context)
def yes(request,id):
    dele(id)
    return redirect('/')