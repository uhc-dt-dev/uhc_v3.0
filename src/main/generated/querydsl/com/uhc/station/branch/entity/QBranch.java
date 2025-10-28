package com.uhc.station.branch.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBranch is a Querydsl query type for Branch
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBranch extends EntityPathBase<Branch> {

    private static final long serialVersionUID = -7015642L;

    public static final QBranch branch = new QBranch("branch");

    public final EnumPath<com.uhc.station.branch.enums.Brand> brand = createEnum("brand", com.uhc.station.branch.enums.Brand.class);

    public final StringPath contactNumber = createString("contactNumber");

    public final NumberPath<Integer> countryCode = createNumber("countryCode", Integer.class);

    public final NumberPath<Integer> displayOrder = createNumber("displayOrder", Integer.class);

    public final BooleanPath hasDeleted = createBoolean("hasDeleted");

    public final BooleanPath hasVisible = createBoolean("hasVisible");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QBranch(String variable) {
        super(Branch.class, forVariable(variable));
    }

    public QBranch(Path<? extends Branch> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBranch(PathMetadata metadata) {
        super(Branch.class, metadata);
    }

}

