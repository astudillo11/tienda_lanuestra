package Producto;


/**
* Producto/ProductosOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from producto.idl
* viernes 9 de noviembre de 2018 03:25:08 PM COT
*/

public interface ProductosOperations 
{
  boolean insertarProveedor (int id, String nombre, int precio, int id_proveedor);
  boolean actualizarProveedor (int id, String nombre, int precio, int id_proveedor);
  boolean eliminarProveedor (int id);
  String consultarProveedor (int id);
  void shutdown ();
} // interface ProductosOperations
