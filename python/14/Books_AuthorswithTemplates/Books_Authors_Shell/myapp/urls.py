from django.urls import path
from . import views

urlpatterns = [
    path('', views.root),
    path('create_book', views.creat_book, name='create_book'),
    path('book_details/<int:book_id>',views.book_details,name='book_details'),
    path('add_auther/', views.authore, name='add_auther'),
    path('creat_authore/',views.creat_authore,name='creat_authore'),
    path('get_authors/<int:id_author>',views.author_id,name='get_authors')
]
