
package javaadvanced.Poo.Viernes;

/*
Networking es un concepto de conectividad entre 2
o mas dispositivos juntos, que comparten recursos.

La programacion de sockets proporciona la facilidad
para compartir datos entre diferentes dispositivos.

Ventajas de networking en java:

- Compartir recursos
- Centralizar la gestion del software

Conceptos:

- Direccion ip: Numero dinamico asignado a un nodo de
una red compuesto por octetos que van del 0 al 255 
Es una direccion logica que puede ser cambiada.

- Protocolo: COnjunto de reglas que se establecen para 
la comuynicacion. Ej: ETP, TCP, Telnet, SMTP, POP, etc.

- MAC: (Media Access Control) Identidicador unico del NIC
(Network Interface Controller). Un nodo de red puede
tener multiples NIC, pero solo un MAC unico.

Protocolo orientado a la comunicacion:

Conection - Oriented

Es un protocolo de tipo TCP, TCP/IP, confiable pero
lento. El acuse de recibo es enviado por el receptor.

Connection - Less

El receptor no envia el acuse de recibo.
Es rapido, sin embargo no es confiable. Ej: UDP.

Socket: Punto final en una conexion Bidireccional.

La profeamacion de sockets se utiliza para la 
comunicacion entre las aplicaciones que se 
ejecutan entre diferentes aplicaciones JRE.
Java Runtiem Envorioment.

La progamacion de sockets puede ser orientada a
conexion o sin conexion.

Las clases Java Socket y ServerSocket
Son usadas para la programacion orientada a la comunicacion

Las clases Java Socket y ServerSocket
Contection Oriented

Las clases DatagramSocket y DatagramPacket
Conection Less

El cliente del socket necesita saber:

- IP Address del Server
- Port Number
- Socket Class

Socket Class:

- Metodos:
	- Public InputStream getInputStream()
		regresa el is adjunto con el socket
	- Public OutputStream getOutputStream()
		regresa el os adjunto con el socket
	- Public synchronized void close()
		cerrar el socket

Server Socket:

- Metodos
	- Public Socket accept()
		Establece la conexion entrante
	- Public synchronized void cloase()
		Cierra la conexion

Informacion que contiene una URL

Protocol: En este caso http es el protocolo.
Server Name o IP Address: oracle y codigofacilito
Port Number: Es un atributo opcional, si 
escribimos google.com:80, 80 es el puerto
Si el puerto no es mencionado en la URL regresa -1}
File Nmae o Directory Name: /articulos/nombre

 */
public class NT {
    
}
