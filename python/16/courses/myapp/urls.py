from django.contrib import admin
from django.urls import path
from myapp import views

urlpatterns = [
    path('',views.root),
    path('cereat_course',views.creat_cour),
    path('remov/<int:id>',views.remov),
    path('yes/<int:id>',views.yes)
]
