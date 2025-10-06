from django.shortcuts import render, HttpResponse,redirect
from .models import User

# Create your views here.
def index(request):
    users = User.objects.all().order_by('first_name')
    return render(request, 'index.html', {'users': users})


def create_user(request):
    if request.method == 'POST':
        User.objects.create(
            first_name=request.POST.get('first_name'),
            last_name=request.POST.get('last_name'),
            email=request.POST.get('email'),
            age=request.POST.get('age'),
        )
    return redirect('index')
