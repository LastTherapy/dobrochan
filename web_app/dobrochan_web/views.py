from django.shortcuts import render
from django.http import HttpResponse
from django.template import loader


# Create your views here.
def home(request):
    template = loader.get_template('home.html')
    return HttpResponse(template.render())


# from django.http import HttpResponse
# from django.template import loader
#
#
# def testapp(request):
#     template = loader.get_template('myfirst.html')
#     return HttpResponse(template.render())