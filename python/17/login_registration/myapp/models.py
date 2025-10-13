from django.db import models

# Create your models here.
class User(models.Model):
    first_name=models.CharField(max_length=50)
    last_name=models.CharField(max_length=50)
    email=models.EmailField(unique=True)
    password=models.CharField(max_length=50)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)



def creat_user(first_name,last_name,email,password):
    return User.objects.create(first_name=first_name,last_name=last_name,email=email,password=password)
