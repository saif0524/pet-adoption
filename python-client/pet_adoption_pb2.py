# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: pet-adoption.proto
# Protobuf Python Version: 5.27.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    2,
    '',
    'pet-adoption.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12pet-adoption.proto\x12\x0bpetadoption\"_\n\x12RegisterPetRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06gender\x18\x02 \x01(\t\x12\x0b\n\x03\x61ge\x18\x03 \x01(\x05\x12\r\n\x05\x62reed\x18\x04 \x01(\t\x12\x0f\n\x07picture\x18\x05 \x01(\x0c\"7\n\x13RegisterPetResponse\x12\x0f\n\x07success\x18\x01 \x01(\x08\x12\x0f\n\x07message\x18\x02 \x01(\t\"L\n\x10SearchPetRequest\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06gender\x18\x02 \x01(\t\x12\x0b\n\x03\x61ge\x18\x03 \x01(\x05\x12\r\n\x05\x62reed\x18\x04 \x01(\t\"T\n\x07PetInfo\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0e\n\x06gender\x18\x02 \x01(\t\x12\x0b\n\x03\x61ge\x18\x03 \x01(\x05\x12\r\n\x05\x62reed\x18\x04 \x01(\t\x12\x0f\n\x07picture\x18\x05 \x01(\x0c\"7\n\x11SearchPetResponse\x12\"\n\x04pets\x18\x01 \x03(\x0b\x32\x14.petadoption.PetInfo2\xab\x01\n\x0bPetAdoption\x12P\n\x0bRegisterPet\x12\x1f.petadoption.RegisterPetRequest\x1a .petadoption.RegisterPetResponse\x12J\n\tSearchPet\x12\x1d.petadoption.SearchPetRequest\x1a\x1e.petadoption.SearchPetResponseB\x18\n\x04grpcB\x10PetAdoptionProtob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'pet_adoption_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\004grpcB\020PetAdoptionProto'
  _globals['_REGISTERPETREQUEST']._serialized_start=35
  _globals['_REGISTERPETREQUEST']._serialized_end=130
  _globals['_REGISTERPETRESPONSE']._serialized_start=132
  _globals['_REGISTERPETRESPONSE']._serialized_end=187
  _globals['_SEARCHPETREQUEST']._serialized_start=189
  _globals['_SEARCHPETREQUEST']._serialized_end=265
  _globals['_PETINFO']._serialized_start=267
  _globals['_PETINFO']._serialized_end=351
  _globals['_SEARCHPETRESPONSE']._serialized_start=353
  _globals['_SEARCHPETRESPONSE']._serialized_end=408
  _globals['_PETADOPTION']._serialized_start=411
  _globals['_PETADOPTION']._serialized_end=582
# @@protoc_insertion_point(module_scope)