from django.contrib import admin
from django.urls import path,include
from myapp import views

urlpatterns = [
    path('' ,views.root),
    # path('login',views.info_login),
    path('new_info_page',views.submit),
    # path('submit', views.submit)
]
