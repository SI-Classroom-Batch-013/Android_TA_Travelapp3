# Travel App

Heute wiederholen wir noch einmal das gelernte aus den letzten Tagen.
Dazu wirst du eine Travel-App bauen.
Sie ähnelt vom Aufbau her der Watch-Me App.

Du startest mit einem Projekt.  
Vorgegeben sind:
- Die Datasource-Klasse sowie die City-Klasse. 
Die Datasource-Klasse enthält eine Menge an Städten.  
Eine Stadt besteht aus einem Namen und einem Stadtbild.
- Die Fragmente-Layouts als xml-Dateien.
- Ein Navigations Graph.
- Sowie eine Ordnerstruktur und leere Klassen, die du verwenden kannst.  
Du kannst die Ordnerstruktur und die Klassen verändern, um z.B. Entwurfsmuster
wie MVVM (Model View ViewModel) zu verwenden.

## Aufgaben:

### Aufgabe 1:

- Erstelle das Home-Fragment (Siehe Bild 1). Es enthält eine Liste an Bildern von Städten sowie deren 
Städtenamen in Form einer RecyclerView.
- Wenn man auf ein Bild klickt, wird man zu der Detailansicht der Stadt (Siehe Bild 2) weitergeleitet
- Fülle dazu den ItemAdapter sowie das HomeFragment aus.

<p align="center">
<b>Bild 1:</b> Das Homefragment. 
</p>

<p align="center">
<img src="app/src/main/res/drawable/travel_app_home.png"
width="50%"
height="auto"
/>
</p>


### Aufgabe 2:

- Erstelle die Detailansicht. Es enthält den Namen der Stadt sowie ein Bild der Stadt.
- Über die rote Schaltfläche kann der Nutzer wieder zurücknavigieren.
- Fülle dazu das DetailFragment aus.

<p align="center">
<b>Bild 2:</b> Die Detailansicht der Stadt Athen. 
</p>

<p align="center">
<img src="app/src/main/res/drawable/travel_app_detail.png"
width="50%"
height="auto"
/>
</p>

### Aufgabe 3:

- Veränder deinen Code, sodass LiveData, SharedViewModel und MVVM genutzt werden,
um die Qualität deines Codes zu erhöhen.  
- Stelle selbstständig sicher, dass dein Code LiveData, SharedViewModel und MVVM 
verwendet.