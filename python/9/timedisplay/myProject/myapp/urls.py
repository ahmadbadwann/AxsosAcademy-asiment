from django.contrib import admin 
from django.urls import path, include
from myapp import views

urlpatterns = [
    path ('',views.root),
    path ('time',views.index,name='show_time'),
]
