from django.shortcuts import render,HttpResponse,redirect

from .models import *

# Create your views here.
def root(request):
    return render(request,'index.html')

def regidtr(request):
    new_user=creat_user(request.POST['first_name'],request.POST['last_name'],request.POST['emial'],request.POST['password'])
    return redirect('/')

def login(request):
    log_in=login_user(request.POST['email'],request.POST['password'])
    if log_in==True:
        get_logins=get_login(request.POST['email'])
        context={
            "get_log" :get_logins
        }
        return render(request,'success.html',context)
    else:
        redirect('/')



