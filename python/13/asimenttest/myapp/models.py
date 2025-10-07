from django.db import models

# Create your models here.
class User(models.Model):
    first_name=models.CharField(max_length=20)
    last_name=models.CharField(max_length=20)
    email=models.EmailField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)


class Adreses(models.Model):
    city=models.CharField(max_length=50)
    street=models.CharField(max_length=50)
    user=models.ForeignKey(User,related_name="adreses",on_delete=models.CASCADE)
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)

def creat_user(firstname,lastname,email):
    return User.objects.create(first_name=firstname,last_name=lastname,email=email)

def creat_adrese(city,street,user):
    return Adreses.objects.create(city=city,street=street,user=user)


def get_user():
    return User.objects.all()

