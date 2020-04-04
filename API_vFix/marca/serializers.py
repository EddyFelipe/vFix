from rest_framework import serializers
from .models import Marca

class MarcaSerializers( serializers.ModelSerializer ):
    class Meta:
        model = Marca
        fields = ['id', 'nombre']