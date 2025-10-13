from django.db import models
import bcrypt
# Create your models here.
class User(models.Model):
    first_name=models.CharField(max_length=50)
    last_name=models.CharField(max_length=50)
    email=models.EmailField(unique=True)
    password=models.CharField(max_length=50)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)



def creat_user(first_name,last_name,email,password):
    hashed_password = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
    return User.objects.create(first_name=first_name,last_name=last_name,email=email,password=hashed_password)
    
def login_user(email,password):
    user= User.objects.get(email=email)
    if bcrypt.checkpw(password.encode(), user.password.encode()):
        return True
    else:
        return False

def get_login(email):
    return User.objects.get(email=email)