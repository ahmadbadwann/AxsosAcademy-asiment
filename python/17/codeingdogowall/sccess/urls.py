from django.urls import path
from . import views

urlpatterns = [
    path('post_message',views.post_message),
    path('destroy',views.destroy),

]