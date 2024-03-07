package main.java.com.example.javaassignment13731;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtility {
    // create variables to hold username, password and connection url
    private static String user = "Sneha200533731";
    private static String pass = "eY7YbisAFw";
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/" + user;

    // static function which inserts song data to database
    public static int insertSongToDB(Spotify spotify) throws SQLException {
        int songId = -1;
        ResultSet resultSet = null;

        // create the sql string to insert the data
        String sql = "INSERT INTO songs (track_name, artist, year, streams) VALUES (?, ?, ?, ?);";

        //try with resource block
        try(
                Connection conn = DriverManager.getConnection(connectURL, user, pass);
                PreparedStatement preparedStatement = conn.preparedStatement(sql, new String[]{"bookId"});
                ){
          preparedStatement.setString(1, spotify.getTrackName());
          preparedStatement.setString(2, spotify.getArtist());
          preparedStatement.setInt(3, spotify.getYear());
          preparedStatement.setDouble(4, spotify.getStreams());

          //execute insert statement
            preparedStatement.executeUpdate();

            //get new song id from result set
            resultSet = preparedStatement.getGeneratedKeys();

            while (resultSet.next()){
                songId = resultSet.getInt(1);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(resultSet != null){
                resultSet.close();
            }
        }

        return songId;
    }
}
