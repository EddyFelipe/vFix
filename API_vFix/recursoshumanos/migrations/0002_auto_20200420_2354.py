# Generated by Django 3.0.4 on 2020-04-20 23:54

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('recursoshumanos', '0001_initial'),
    ]

    operations = [
        migrations.AlterField(
            model_name='rh',
            name='contrasenia',
            field=models.CharField(default='', max_length=45),
        ),
    ]