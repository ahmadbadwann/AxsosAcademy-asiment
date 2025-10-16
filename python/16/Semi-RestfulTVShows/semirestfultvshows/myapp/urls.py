from django.urls import path
from myapp import views

urlpatterns = [
    path('',views.root),
    path('new',views.new_show),
    path('add_anew_show',views.add_anew_show,name="add_anew_show"),
    path('show/<int:tvid>',views.showtv),
    path('show/<int:tvid>/edit',views.edit_show),
    path('show/<int:id>/update_show',views.update_show),
    path('delete/<int:id>',views.delete)
]