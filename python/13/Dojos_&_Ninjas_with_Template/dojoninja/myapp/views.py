from django.shortcuts import render,redirect
from .models import *

# Create your views here.
def root(request):

    dojos=get_dojos()

    context={
        "dojos": dojos
    }
    return render(request,'index.html',context)


def creat_do(request):
    dojo=creat_dojo(request.POST['name'],request.POST['city'],request.POST['state'])
    return redirect("/")


def creat_ni(request):
    ninja=creat_ninjas(request.POST['first_name'],request.POST['last_name'],request.POST['dojo'])
    return redirect("/")