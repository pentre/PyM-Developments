/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import model.Commission;
import model.Quote;
/**
 *
 * @author lalil
 */
public interface QuoteController {
    default String createQuoteCommission(String idClient,String phoneClient,String idFurniture,int quantity, String branch, java.util.Date date){
        Quote quote = new Quote(idFurniture,quantity,idClient,phoneClient,branch,date);
        String message = quote.store(Controller.database);
        if( !message.equals("La cotización fue adicionada exitosamente. ")){
            return message;
        }
        Commission commission = new Commission(idFurniture,quantity,false);
        message += commission.store(Controller.database);
        return message;
    }
}
