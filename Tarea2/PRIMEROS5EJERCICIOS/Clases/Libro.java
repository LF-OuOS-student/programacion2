package Clases;
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    
    public Libro(String titulo,String autor,int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void mostrarLibro(){
        System.out.println("Libro:"+getTitulo()+getAutor()+getPaginas());
        
    }
//Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

//Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
    
    
}
