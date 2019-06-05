package com.sinensia.api;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Decoradores en forma de anotación
@WebServlet(asyncSupported = true, urlPatterns = "/api/productos")
public class ProductoRestController extends HttpServlet {

    private ServicioProductoSingleton servProd;

    @Override
    public void init() {
        servProd = ServicioProductoSingleton.getInstancia();
        servProd.insertar(new Producto("Peine", "10 euros"));
        servProd.insertar(new Producto("Ordenador", "1000 euros"));
        servProd.insertar(new Producto("Pantalla", "100 euros"));
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doOptions(request, response);
        PrintWriter escritorRespuesta = response.getWriter();
        response.setContentType("application/json;charset=UTF-8");
        //AQUI DEVOLVEMOS EL JSON

        ArrayList<Producto> nuevosProductos = servProd.obtenerTodos();
        Gson gson = new Gson();

        // JsonArray ultimoJson = new JsonArray();
        //servProd.obtenerTodos();
        //DEVOLVER LA RESPUESTA
        String jsonRespuesta = gson.toJson(nuevosProductos);
        escritorRespuesta.println(jsonRespuesta);

    }

    @Override
    protected void doPut(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter escritorRespuesta = response.getWriter();
        response.setContentType("application/json;charset=UTF-8");

        BufferedReader bufRead = request.getReader();

        StringBuilder textoJson = new StringBuilder();
        for (String lineaJson = bufRead.readLine();
                lineaJson != null;
                lineaJson = bufRead.readLine()) {

            textoJson.append(lineaJson);
        }
        bufRead.close();

        // System.out.println(">>>> " + textoJson.toString().toUpperCase());
        Gson gson = new Gson();
        Producto producto = gson.fromJson(textoJson.toString(), Producto.class);

        //System.out.println(">>>> " + producto.getNombre());
        //  producto.setNombre(producto.getNombre().toUpperCase());
        // producto.setPrecio("5000 bolivares");
        //ServicioProductoSingleton sps = ServicioProductoSingleton.getInstancia(); 
        //  servProd.modificar(producto);
        //  System.out.println("ESTE ES EL PRODUCTO "+ producto.toString());
        //DEVOLVER LA RESPUESTA COMO JSON
        String jsonRespuesta = gson.toJson(producto);
        escritorRespuesta.println(jsonRespuesta);

    }

    //**************************************************************************************************************
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doOptions(request, response);
        PrintWriter escritorRespuesta = response.getWriter();
        response.setContentType("application/json;charset=UTF-8");

        BufferedReader bufRead = request.getReader();

        StringBuilder textoJson = new StringBuilder();
        for (String lineaJson = bufRead.readLine();
                lineaJson != null;
                lineaJson = bufRead.readLine()) {
            textoJson.append(lineaJson);
        }
        bufRead.close();

        Gson gson = new Gson();
        Producto producto = gson.fromJson(textoJson.toString(), Producto.class);

        System.out.println(">>>> " + producto.getNombre());

        //producto.setNombre("ulalaaaaa");
        // producto.setNombre(producto.getNombre().toUpperCase());
        //INSERTAR PRODUCTO
        servProd.insertar(producto);

        System.out.println("ESTE ES EL PRODUCTO " + producto.getNombre());

    }

    protected void doDelete(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

//       PrintWriter escritorRespuesta =  response.getWriter();
//        response.setContentType("application/json;charset=UTF-8");
//        
//        BufferedReader bufRead = request.getReader();
//        
//        StringBuilder textoJson = new StringBuilder();
//        for (String lineaJson = bufRead.readLine(); 
//                lineaJson != null; 
//                lineaJson = bufRead.readLine()) {
//                textoJson.append(lineaJson);
//        }
//        bufRead.close();
// 
//        Gson gson = new Gson();
//        Producto producto = gson.fromJson(textoJson.toString(), Producto.class);
        //eliminar PRODUCTO
        //servProd.eliminar(producto);
    }

    @Override
    protected void doOptions(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException 
         {
      response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
        response.setHeader("Access-Control-Allow-Methods", "POST");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
