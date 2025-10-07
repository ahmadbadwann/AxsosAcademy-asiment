from django.shortcuts import render,redirect
from .models import *

# Create your views here.
def root(request):
    get_dojos=get_dojo()
    context={
        "dojos": get_dojos
    }
    return render(request,'index.html',context)


def creat(request):
    dojo=creat_dojo("ahmad","badwan","as")
    nanja=creat_ninjas("saed","sdasd",dojo)
    return redirect("/")