from django.shortcuts import render,HttpResponse,redirect

from .models import *

# Create your views here.
def root(request):
    return render(request,'index.html')

def regidtr(request):
    new_user=creat_user(request.POST['first_name'],request.POST['last_name'],request.POST['emial'],request.POST['password'])
    return redirect('/')