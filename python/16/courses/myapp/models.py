from django.db import models
class CourseManager(models.Manager):
    def basic_validator(self, postData):
        errors ={}
        if len(postData['name'])>5:
            errors['name']="name shode not be up of 5ch"
        if len(postData['name'])=="":
            errors['name']="name is impty"
        if len(postData['desc'])<15:
            errors['desc']="descrption shode not be les than 15ch"
        return errors

# Create your models here.
class Course(models.Model):
    name=models.CharField(max_length=30)
    descrption=models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects=CourseManager()

def cereat_course(name,descrption):
    return Course.objects.create(name=name,descrption=descrption)

def get_all():
    return Course.objects.all()
def get_id(id):
    return Course.objects.get(id=id)

def dele(id):
    show_delete=Course.objects.get(id=id)
    show_delete.delete()