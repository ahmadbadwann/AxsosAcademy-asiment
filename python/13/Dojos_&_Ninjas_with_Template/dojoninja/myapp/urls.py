from django.contrib import admin
from django.urls import path ,include
from myapp import views
urlpatterns = [
    path('',views.root),
    path('create_dojo/',views.creat_do),
    path('creat_ninja/',views.creat_ni)
]