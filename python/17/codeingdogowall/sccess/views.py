from django.shortcuts import render, redirect
from django.contrib import messages
from .models import *
from myapp import models
# Create your views here.
def post_message(request):
    new_post_messag=new_post_message(request.POST['post_mwssage'],int(request.POST['user_id']))
    get_all_messages=get_all_message()
    context={
        "get_all_messages" :get_all_messages,
        "get_log" : models.get_login(request.session['email'])
    }
    return render(request,'success.html',context)

def destroy(request):
    request.session.flush()
    return redirect('/')