//package com.example.backend.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class UserRepository {
//
//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public UserRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    private final RowMapper<UserEntity> userRowMapper = (rs, rowNum) -> {
//        UserEntity user = new UserEntity();
//        user.setId(rs.getInt("id"));
//        user.setUsername(rs.getString("username"));
//        user.setEmail(rs.getString("email"));
//        user.setCreatedAt(rs.getTimestamp("created_at"));
//        return user;
//    };
//
//    public List<UserEntity> findAll() {
//        String sql = "SELECT * FROM users";
//        return jdbcTemplate.query(sql, userRowMapper);
//    }
//
//    public UserEntity findById(int id) {
//        String sql = "SELECT * FROM users WHERE id = ?";
//        return jdbcTemplate.queryForObject(sql, new Object[]{id}, userRowMapper);
//    }
//
//    public int save(UserEntity user) {
//        String sql = "INSERT INTO users (username, email) VALUES (?, ?)";
//        return jdbcTemplate.update(sql, user.getUsername(), user.getEmail());
//    }
//
//    public int update(UserEntity user) {
//        String sql = "UPDATE users SET username = ?, email = ? WHERE id = ?";
//        return jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getId());
//    }
//
//    public int delete(int id) {
//        String sql = "DELETE FROM users WHERE id = ?";
//        return jdbcTemplate.update(sql, id);
//    }
//}
