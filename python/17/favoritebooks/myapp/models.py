from django.db import models

# Create your models here.
class User(models.Model):
    first_name=models.CharField(max_length=45)
    last_name=models.CharField(max_length=45)
    email=models.EmailField()
    password=models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Book(models.Model):
    title=models.CharField(max_length=255)
    des=models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    uploaded_by=models.ForeignKey(User,related_name="books",on_delete=models.CASCADE)
    user_who_likes=models.ManyToManyField(User,related_name='liks')




def request_user(first_name,last_name,email,password):
    return User.objects.create(first_name=first_name,last_name=last_name,email=email,password=password)

def log_in(email,password):
    return User.objects.get(email=email,password=password)

def log_in_id(id):
    return User.objects.get(id=id)

def creat_book(title,des, id):
    user = User.objects.get(id=id)
    book = Book.objects.create(title=title,des=des , uploaded_by = user)
    return book

def get_all_booke():
    return Book.objects.all()


def get_book_id(id):
    return Book.objects.get(id=id)


def get_all_likers(bookid):
    book = get_book_id(bookid)
    return  book.user_who_likes.all()


def update_book(id,title,disc):
    book=Book.objects.get(id=id)
    book.title = title
    book.des = disc
    book.save()

def delete(id):
    book = Book.objects.get(id=id)
    book.delete()