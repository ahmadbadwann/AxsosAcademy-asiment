from django.db import models

# Create your models here.
class Books(models.Model):
    title=models.CharField(max_length=255)
    desc=models.TextField()
    created_at=models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


class Authors(models.Model):
    first_name=models.CharField(max_length=45)
    last_name=models.CharField(max_length=45)
    created_at=models.DateTimeField(auto_now_add=True)
    notes=models.CharField(default="sho ma badek")
    updated_at = models.DateTimeField(auto_now=True)
    books_authors=models.ManyToManyField(Books,related_name="authors")


def cre_book(title,desc):
    return Books.objects.create(title=title,desc=desc)

def get_all_books():
    return Books.objects.all()

def get_book_id(id_book):
    return Books.objects.get(id=id_book)

def cre_author(first_name,last_name,notes):
    return Authors.objects.create(first_name=first_name,last_name=last_name,notes=notes)

def get_all_authors():
    return Authors.objects.all()

def get_author_id(id_author):
    return Authors.objects.get(id=id_author)