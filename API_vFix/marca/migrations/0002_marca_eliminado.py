# Generated by Django 3.0.4 on 2020-03-27 00:45

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('marca', '0001_initial'),
    ]

    operations = [
        migrations.AddField(
            model_name='marca',
            name='eliminado',
            field=models.BooleanField(default=False),
        ),
    ]
