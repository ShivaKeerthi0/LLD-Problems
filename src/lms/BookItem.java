package lms;

import java.util.Date;

public class BookItem extends Book{

    private int barCode;
    private boolean isAvailable;
    private Date borrowedDate;
    private Date returnDate;
    private  Rack rackLocation;
    private BookStatus status;
}
