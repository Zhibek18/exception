package kz.kakimzhanova.exception.main;

import kz.kakimzhanova.exception.exception.WrongInputException;
import kz.kakimzhanova.exception.reader.Reader;
import kz.kakimzhanova.exception.report.Report;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        try{
            double[] doubles = reader.readNumbers("res.txt");
            Report report = new Report();
            report.printReport(doubles);
        } catch(IOException e) {
            e.printStackTrace();
        } catch(NumberFormatException e) {
            e.printStackTrace();
        } catch(WrongInputException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }catch (OutOfMemoryError e) {
            e.printStackTrace();
        }
    }
}
