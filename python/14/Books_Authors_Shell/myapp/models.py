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