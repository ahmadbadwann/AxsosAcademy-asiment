from django.db import models
from myapp.models import User
# Create your models here.
class Message(models.Model):
    message=models.TextField()
    user_id=models.ForeignKey(User, related_name='messages', on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


class Comments(models.Model):
    comment=models.TextField()
    message_id=models.ForeignKey(Message, related_name='comments',on_delete=models.CASCADE)
    user_id=models.ForeignKey(User,related_name='comments',on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

def new_post_message(message,user_id):
    user = User.objects.get(id = user_id)
    return Message.objects.create(message=message,user_id=user)

def get_all_message():
    return Message.objects.all()