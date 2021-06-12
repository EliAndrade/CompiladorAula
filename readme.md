```glsl

/* Declaração de váriavel */
int a, int c;
a = 1;
c = 3;

/* Declaração de constante */
const int b;
b = 1;

/* Floats */
float e;
e = 2.71;
println(e);

/* Strings */
const string texto;
texto = 'TEXTO ' + a;
println(texto);

/* if else */
if (a > 10) {
	println('a > 10!');
} else if (a > 1) {
	println('a > 1!');
} else {
	println('a <= 1!');
}
println(b);

/* for */
int i;
i = 0;
for (i = 0; i < 10; i = i + 1) {
	println(i);
}

/* while */
while (i > 0) {
	i = i - 1;
	println(i);
}


/* Arrays */
int arr[10];
arr[9] = 200;
arr[1] = 100;

println(arr[1] + arr[9]);
```