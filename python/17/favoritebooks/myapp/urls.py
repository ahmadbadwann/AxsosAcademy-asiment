from django.contrib import admin
from django.urls import path
from myapp import views

urlpatterns = [
    path('',views.root),
    path('regeisteration',views.regeisteration),
    path('log_in',views.logg_in),
    path('add_favorit_booke',views.add_book),
    path('edit_book/<int:bookid>/<int:userid>/',views.edit_book),
    path('view_book/<int:bookid>/<int:userid>/',views.view_book),
    path('update',views.update),
    path('delete',views.delete_book),
    path('like_book',views.like_book)
]
