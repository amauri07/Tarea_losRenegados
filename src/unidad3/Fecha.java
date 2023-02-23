package unidad3;
//Ejercicio 3.14
public class Fecha {
	
    private int dia; 
    private int mes; 
    private int año;
   
    public Fecha( int pMes , int pDia , int pAño )
    {
        if( pMes > 0) {
        if( pMes <= 12 )
        {
          mes = pMes;
        }  
        }
        if( pDia > 0 )
        {
            if( pDia <= 31 )
            {
                dia = pDia;
            }
        }
        if( pAño > 1930 )
        {
            if( pAño <= 2030 )
            {
                año = pAño;
            }
        }
    } 
    public void establecerMes( int pMes )
    {
        if( pMes > 0 )
        {
            if( pMes <= 31 )
            {
                mes = pMes;
            }
        }
    }
    public int obtenerMes()
    {
        return mes;
    }
    public void establecerDia( int pDia )
    {
        if( pDia > 0)
        {
            if( pDia <= 31 )
            {
                dia = pDia;
            }
        }
    }
    public int obtenerDia()
    {
        return dia;
    }
    public void establecerAño( int pAño )
    {
        if( pAño > 1930)
        {
            if ( pAño <=  2030 ) {
            año = pAño;
            }
        }
    }
   
    public int obtenerAño()
    {
        return año;
    }
    public void mostrarFecha()
    {
        System.out.print( "\nFecha seleccionada: " );
        System.out.printf( "\n %d / %d / %d " , obtenerDia() , obtenerMes() , obtenerAño() );
    } 
}
