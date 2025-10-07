from django.shortcuts import render, redirect
from .models import get_user,creat_user,creat_adrese

# Create your views here.
def root(request):
    get_users=get_user()
    context={
        "users":get_users
    }
    return render(request,'index.html',context)


def creat(request):
    user=creat_user("ahmad","badwan","dbdby11@gmail.com")
    adrese=creat_adrese("ramllhh","rokab",user)
    return redirect("/")


