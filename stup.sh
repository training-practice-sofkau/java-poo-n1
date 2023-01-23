
declare -a StringArray=("Efrain"
"James_Arley"
"Brayan_David"
"Juan_Diego"
"Francy_Julieth"
"Yeison_Ferney"
"Melissa"
"Yolima_Alejandra"
"Nevardo_Antonio"
"Gretty_María"
"Jesus_Miguel"
"Laura_Vanessa"
"Marjorie_Katherine"
"Jonathan_Andres"
"Jose_Miguel"
"Sergio_Andrés"
"Cristian_Camilo"
"Cristhian_Esneider"
"Juan_David"
"Estiven"
"Eros_Jose"
"Santiago"
"Luis_Fernando"
"Ivan_Dario"
"Jessica_Andrea" )

for val in ${StringArray[@]}; do
 git branch $val
done

for val in ${StringArray[@]}; do
 git push origin $val
done