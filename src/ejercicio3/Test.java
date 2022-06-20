//package ejercicio3;
//
//import Leer.Leer;
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import listaDinamica.ListaDinamica;
//
//public class Test {
//
//    //atributos
//    private ListaDinamica<Pregunta> preguntas;
//    private int puntosTotales;
//    private int preguntaActual;
//
//    //Constructor
//    public Test() {
//        preguntas = new ListaDinamica<>();
//        puntosTotales = 0;
//        preguntaActual = 0;
//    }
//
//    //Getter
//    public ListaDinamica<Pregunta> getPreguntas() {
//        return preguntas;
//    }
//
//    public int getPuntosTotales() {
//        return puntosTotales;
//    }
//
//    public int getPreguntaActual() {
//        return preguntaActual;
//    }
//
//    public Pregunta siguientePregunta() {
//
//        Pregunta p = preguntas.get(preguntaActual);
//
//        if (p != null) {
//            preguntaActual++;
//        }
//
//        return p;
//
//    }
//
//    public void reiniciarTest() {
//        preguntaActual = 0;
//        puntosTotales = 0;
//    }
//
//    public void realizarTest() {
//
//        if (preguntas.isEmpty()) {
//            System.out.println("No hay preguntas");
//        } else {
//
//            Leer teclado = new Leer();
//
//            int i = 0, respuesta;
//            Pregunta p;
//
//            while (i < preguntas.size()) {
//
//                p = preguntas.get(i);
//
//                p.mostrarPregunta();
//
//                respuesta = teclado.pedirIntRango(1, p.getRespuestas().size(), "Introduce la respuesta");
//
//
//                if (p.comprobarRespuesta(respuesta)) {
//                    System.out.println("Has acertado");
//                    puntosTotales += p.getPuntos();
//                } else {
//                    System.out.println("No has acertado");
//                }
//
//                i++;
//            }
//
//        }
//
//        System.out.println("Has obtenido " + puntosTotales + " puntos");
//
//    }
//
//    public void cargarFichero(String fichero) throws FileNotFoundException, IOException {
//
//        BufferedReader br = new BufferedReader(new FileReader(fichero));
//
//        String linea;
//        Pregunta p;
//        ListaDinamica<Respuesta> respuestas = new ListaDinamica<>();
//        String texto_pregunta = "";
//        int puntosPregunta = 0, opcioncorrecta = 0;
//        boolean pregunta = false, respuesta = false, puntos = false;
//
//        while ((linea = br.readLine()) != null) {
//
//            try {
//
//                if (linea.startsWith(";P;")) {
//                    texto_pregunta = linea.substring(3);
//                    pregunta = true; 
//                } else if (pregunta && linea.startsWith(";R;")) {
//                    opcioncorrecta = Integer.parseInt(linea.substring(3).trim());
//                    respuesta = true; 
//                    
//                } else if (respuesta) {
//                    puntosPregunta = Integer.parseInt(linea.trim());
//                    puntos = true; 
//                    
//                } else if (pregunta) {
//                    respuestas.addLast(new Respuesta(linea));
//
//                    if (respuestas.size() > 4) {
//                        throw new Exception();
//                    }
//                }
//
//               
//                if (pregunta && respuesta && puntos && (respuestas.size() >= 2 && respuestas.size() <= 4)) {
//
//                    respuestas.get(opcioncorrecta - 1).setCorrecta(true);
//
//                    p = new Pregunta(texto_pregunta, respuestas, puntosPregunta);
//
//                    preguntas.addLast(p);
//
//                    pregunta = false;
//                    respuesta = false;
//                    puntos = false;
//                    respuestas = new ListaDinamica<>();
//
//                }
//
//            } catch (Exception ex) {
//                pregunta = false;
//                respuesta = false;
//                puntos = false;
//                respuestas = new ListaDinamica<>();
//            }
//
//        }
//
//        br.close();
//
//    }
//
//}