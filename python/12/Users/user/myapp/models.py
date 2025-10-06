from django.db import models

# Create your models here.
from django.db import models

class User(models.Model):
    first_name=models.CharField(max_length=20)
    last_name=models.CharField(max_length=20)
    email=models.EmailField(unique=True)
    created_at=models.DateTimeField(auto_now_add=True)

def __str__(self):
    return f"{self.first_name} {self.last_name}"