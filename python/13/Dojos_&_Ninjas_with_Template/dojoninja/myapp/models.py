from django.db import models

# Create your models here.
class Dojo(models.Model):
    name=models.CharField(max_length=255)
    city=models.CharField(max_length=250)
    state=models.CharField(max_length=2)
    crated_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)
    desc = models.TextField(default="old dojo")


class Ninjas(models.Model):
    first_name=models.CharField(max_length=255)
    last_name=models.CharField(max_length=255)
    dojo=models.ForeignKey(Dojo,related_name='ninjas',on_delete=models.CASCADE)
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at=models.DateTimeField(auto_now=True)


def creat_dojo(name,city,state):
    return Dojo.objects.create(name=name,city=city,state=state)


def creat_ninjas(firstname,lastname,dojo):
    newdojo=Dojo.objects.get(id=dojo)
    return Ninjas.objects.create(first_name=firstname,last_name=lastname,dojo=newdojo)

def get_dojos():
    return Dojo.objects.all()


def get_ninja():
    return Ninjas.objects.all()
