package com.capitalone.dashboard.repository;

import com.capitalone.dashboard.model.Role;
import com.capitalone.dashboard.model.ScopeOwnerCollectorItem;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, String> {

    @Query(value = "{ 'name' : ?0}")
    Role findRoleByName(String name);

}
