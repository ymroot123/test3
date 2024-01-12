package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class StudentDaoImpl implements JdbcOperation<TechnicalAchievement, Integer> {
    @Override
    public void insert(TechnicalAchievement entity) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO admin VALUES (?,?,?,?,?,?,?)")) {
            preparedStatement.setInt(1, entity.getID());
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setString(3, entity.getDomain());
            preparedStatement.setString(4, entity.getDescription());
            preparedStatement.setString(5, entity.getEthical());
            preparedStatement.setString(6, entity.getSocialImpact());
            preparedStatement.setString(7, entity.getRisk());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void update(TechnicalAchievement entity, String primaryKey) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE admin SET name=?, domain=?, description=?, Ethical=?,socialImpact=?,Risk=? WHERE ID=?")) {
            preparedStatement.setInt(1, entity.getID());
            preparedStatement.setString(2, entity.getName());
            preparedStatement.setString(3, entity.getDomain());
            preparedStatement.setString(4, entity.getDescription());
            preparedStatement.setString(5, entity.getEthical());
            preparedStatement.setString(6, entity.getSocialImpact());
            preparedStatement.setString(7, entity.getRisk());
            preparedStatement.setString(8, primaryKey);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void delete(String primaryKey) {
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM admin WHERE ID=?")) {
            preparedStatement.setString(1, primaryKey);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override//遍历
    public List<TechnicalAchievement> queryAll() {
        List<TechnicalAchievement> resultList = new ArrayList<>();
        try (Connection connection = JDBCUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM admin")) {
            while (resultSet.next()) {
                TechnicalAchievement result = new TechnicalAchievement();
                result.setID(resultSet.getInt("ID"));
                result.setName(resultSet.getString("name"));
                result.setDomain(resultSet.getString("domain"));
                result.setDescription(resultSet.getString("description"));
                result.setEthical(resultSet.getString("Ethical"));
                result.setSocialImpact(resultSet.getString("socialImpact"));
                result.setRisk(resultSet.getString("Risk"));
                resultList.add(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    @Override//分页
    public List<TechnicalAchievement> queryWithPagination(int page, int pageSize) {
        List<TechnicalAchievement> resultList = new ArrayList<>();
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM admin LIMIT ? OFFSET ?")) {
            int offset = (page - 1) * pageSize;
            preparedStatement.setInt(1, pageSize);
            preparedStatement.setInt(2, offset);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TechnicalAchievement result = new TechnicalAchievement();
                result.setID(resultSet.getInt("ID"));
                result.setName(resultSet.getString("name"));
                result.setDomain(resultSet.getString("domain"));
                result.setDescription(resultSet.getString("description"));
                result.setEthical(resultSet.getString("Ethical"));
                result.setSocialImpact(resultSet.getString("socialImpact"));
                result.setRisk(resultSet.getString("Risk"));
                resultList.add(result);

                resultList.add(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }

    @Override
    public List<TechnicalAchievement> searchByCondition(int ID, String name, String domain, String description, String Ethical,String soicalImpact,String Risk) {
        List<TechnicalAchievement> resultList = new ArrayList<>();
        try (Connection connection = JDBCUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM admin where ID like ? and name like ? and domain like ? and description like ? and Ethical like ? and socialImpact like ? and Risk like ?")) {
            preparedStatement.setString(1, ID+"%");
            preparedStatement.setString(2, name+"%");
            preparedStatement.setString(3, domain+"%");
            preparedStatement.setString(4, description+"%");
            preparedStatement.setString(5, Ethical+"%");
            preparedStatement.setString(6, soicalImpact+"%");
            preparedStatement.setString(7, Risk+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                TechnicalAchievement result = new TechnicalAchievement();
                result.setID(resultSet.getInt("ID"));
                result.setName(resultSet.getString("name"));
                result.setDomain(resultSet.getString("domain"));
                result.setDescription(resultSet.getString("description"));
                result.setEthical(resultSet.getString("Ethical"));
                result.setSocialImpact(resultSet.getString("socialImpact"));
                result.setRisk(resultSet.getString("Risk"));
                resultList.add(result);
                resultList.add(result);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultList;
    }
}