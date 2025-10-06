from django.shortcuts import render,redirect

# Create your views here.
def root(request):
    if 'visits' in request.session:
        request.session['visits']+=1
    else:
        request.session['visits']=1
    context={
        'viditd':request.session['visits']
    }
    return render(request,'index.html',context)

def refresh(request):
    request.session['visits']=0
    return render(request,'index.html')