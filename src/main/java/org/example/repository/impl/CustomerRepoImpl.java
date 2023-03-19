package org.example.repository.impl;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.example.entity.Customer;
import org.example.repository.CustomerRepo;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class CustomerRepoImpl //implements CustomerRepo<Customer>
{
 //   private final DataSource pool;

//    public static final String GET_BY_ID = "SELECT id, login, password FROM customers WHERE id=?";
//    public static final String UPDATE = "UPDATE customers SET login=?, password=? WHERE id=?";
//
//    @Override
//    @SneakyThrows
//    public Optional<Customer> findById(Long id) {
//        try (Connection connection = pool.getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID);
//            preparedStatement.setLong(1, id);
//
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            if (resultSet.next()) {
//                Customer customer = new Customer();
//                customer.setId(resultSet.getLong("id"));
//                customer.setLogin(resultSet.getString("login"));
//                customer.setPassword(resultSet.getString("password"));
//                return Optional.of(customer);
//            } else {
//                throw new SQLException();
//            }
//        }
//    }
//
//    @Override
//    @SneakyThrows
//    public void save(Customer entity) {
//        try (Connection connection = pool.getConnection()) {
//            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE);
//            preparedStatement.setString(1, entity.getLogin());
//            preparedStatement.setString(2, entity.getPassword());
//            preparedStatement.setLong(3, entity.getId());
//            preparedStatement.execute();
//        }
//    }
}
