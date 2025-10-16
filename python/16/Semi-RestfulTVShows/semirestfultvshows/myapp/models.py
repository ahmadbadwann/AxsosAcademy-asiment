from django.db import models

class ShowManager(models.Manager):
    def basic_validator(self, postData):
        errors = {}
        if len(postData['title'])<2:
            errors['title'] = "title shoud be at lest 2ch"
        if len(postData['network'])<3:
            errors['network']="network shoud be at lest 2ch"
        if len(postData['desc'])<10:
            errors['desc'] = "description shoud be at lest 10ch"
        return errors
    
# C reate your models here.
class Shows(models.Model):
    title=models.CharField(max_length=100)
    network=models.CharField(max_length=255)
    release_date=models.DateTimeField()
    description=models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()



def add_a_new_show(title,network,release_date,description):
    return Shows.objects.create(title=title,network=network,release_date=release_date,description=description)

def get_all_show():
    return Shows.objects.all()

def get_show_id(id):
    return Shows.objects.get(id=id)

def edit_showw(id,title,network,release_date,description):
    ed_sh=Shows.objects.get(id=id)
    ed_sh.title=title
    ed_sh.network=network
    ed_sh.release_date=release_date
    ed_sh.description=description
    ed_sh.save()
    return ed_sh

def dele(id):
    show_delete=Shows.objects.get(id=id)
    show_delete.delete()