from django.shortcuts import render,HttpResponse, redirect

# Create your views here.
def root(request):
    return render(request,'index.html')

#def info_login(request):
    return render(request,'info.html')

# def some_function(request):
#     if request.method == "POST":
#         # print(username)
#         # print(dogolocation)
#         # print(favotite_language)
#         # print(comment)
#         redirect('new_info_page')
    
def submit(request):
    context={
            'username' : request.POST["username"],
            'dogolocation' : request.POST["location"],
            'favotite_language' : request.POST["Favorite_language"],
            'comment' : request.POST["comment_optional"]
            }
    print(context['username'])
    print(context['dogolocation'])
    print(context['favotite_language'])
    print(context['comment'])
    return render(request,"info.html",context)
